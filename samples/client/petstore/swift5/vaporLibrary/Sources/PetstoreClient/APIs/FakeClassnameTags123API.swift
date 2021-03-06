//
// FakeClassnameTags123API.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Vapor
#if canImport(AnyCodable)
import AnyCodable
#endif

open class FakeClassnameTags123API {

    /**
     To test class name in snake case
     PATCH /fake_classname_test
     To test class name in snake case
     - API Key:
       - type: apiKey api_key_query (QUERY)
       - name: api_key_query
     - parameter body: (body) client model 
     - returns: `EventLoopFuture` of `ClientResponse` 
     */
    open class func testClassnameRaw(body: Client, headers: HTTPHeaders = PetstoreClient.customHeaders, beforeSend: (inout ClientRequest) throws -> () = { _ in }) -> EventLoopFuture<ClientResponse> {
        let path = "/fake_classname_test"
        let URLString = PetstoreClient.basePath + path

        guard let apiClient = Configuration.apiClient else {
            fatalError("Configuration.apiClient is not set.")
        }

        return apiClient.send(.PATCH, headers: headers, to: URI(string: URLString)) { request in
            try Configuration.apiWrapper(&request)
            
            
            try request.content.encode(body, using: Configuration.contentConfiguration.requireEncoder(for: Client.defaultContentType))
            
            try beforeSend(&request)
        }
    }

    public enum TestClassname {
        case http200(value: Client, raw: ClientResponse)
        case http0(raw: ClientResponse)
    }

    /**
     To test class name in snake case
     PATCH /fake_classname_test
     To test class name in snake case
     - API Key:
       - type: apiKey api_key_query (QUERY)
       - name: api_key_query
     - parameter body: (body) client model 
     - returns: `EventLoopFuture` of `TestClassname` 
     */
    open class func testClassname(body: Client, headers: HTTPHeaders = PetstoreClient.customHeaders, beforeSend: (inout ClientRequest) throws -> () = { _ in }) -> EventLoopFuture<TestClassname> {
        return testClassnameRaw(body: body, headers: headers, beforeSend: beforeSend).flatMapThrowing { response -> TestClassname in
            switch response.status.code {
            case 200:
                return .http200(value: try response.content.decode(Client.self, using: Configuration.contentConfiguration.requireDecoder(for: Client.defaultContentType)), raw: response)
            default:
                return .http0(raw: response)
            }
        }
    }

}
