#ifndef INCLUDE_API_CLIENT_H
#define INCLUDE_API_CLIENT_H

#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <stdint.h>
#include <curl/curl.h>
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct sslConfig_t {
    char *clientCertFile;         /* client certificate */
    char *clientKeyFile;          /* client private key */
    char *CACertFile;             /* CA certificate */
    int  insecureSkipTlsVerify ;  /* 0 -- verify server certificate */
                                  /* 1 -- skip ssl verify for server certificate */
} sslConfig_t;

typedef struct curlConfig_t {
    long verbose;   /* 0 -- disable verbose (default) */
                    /* 1 -- enable verbose */
    int keepalive;  /* 0 -- disable keepalive (default) */
                    /* 1 -- enable keepalive */
    long keepidle;  /* keep-alive idle time: default to 120 seconds */
    long keepintvl; /* interval time between keep-alive probes: default to 60 seconds */
} curlConfig_t;

typedef struct apiClient_t {
    char *basePath;
    sslConfig_t *sslConfig;
    curlConfig_t *curlConfig;
    void *dataReceived;
    long dataReceivedLen;
    void (*data_callback_func)(void **, long *);
    int (*progress_func)(void *, curl_off_t, curl_off_t, curl_off_t, curl_off_t);
    void *progress_data;
    long response_code;
    char *accessToken;
} apiClient_t;

apiClient_t* apiClient_create();

apiClient_t* apiClient_create_with_base_path(const char *basePath
, sslConfig_t *sslConfig
);

void apiClient_free(apiClient_t *apiClient);

void apiClient_invoke(apiClient_t *apiClient,const char* operationParameter, list_t *queryParameters, list_t *headerParameters, list_t *formParameters,list_t *headerType,list_t *contentType, const char *bodyParameters, size_t bodyParametersLength, const char *requestType);

sslConfig_t *sslConfig_create(const char *clientCertFile, const char *clientKeyFile, const char *CACertFile, int insecureSkipTlsVerify);

void sslConfig_free(sslConfig_t *sslConfig);

char *strReplace(char *orig, char *rep, char *with);

/*
 * In single thread program, the function apiClient_setupGlobalEnv is not needed.
 * But in multi-thread program, apiClient_setupGlobalEnv must be called before any worker thread is created
 */
void apiClient_setupGlobalEnv();

/*
 * This function apiClient_unsetupGlobalEnv must be called whether single or multiple program.
 * In multi-thread program, it is must be called after all worker threads end.
 */
void apiClient_unsetupGlobalEnv();

#endif // INCLUDE_API_CLIENT_H
