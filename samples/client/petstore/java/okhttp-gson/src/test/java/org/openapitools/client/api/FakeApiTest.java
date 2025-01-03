/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.FakeRefParameterPetIdParameter;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.FreeFormObjectTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.time.LocalDate;
import org.openapitools.client.model.ModelApiResponse;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterEnum;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
@Disabled
public class FakeApiTest {

    private final FakeApi api = new FakeApi();

    /**
     * Get a free form object or Json string
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeGetFreeFormObjectGetTest() throws ApiException {
        FreeFormObjectTestClass response = api.fakeGetFreeFormObjectGet();
        // TODO: test validations
    }

    /**
     * Test serialization of outer boolean types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() throws ApiException {
        Boolean body = null;
        Boolean response = api.fakeOuterBooleanSerialize(body);
        // TODO: test validations
    }

    /**
     * Test serialization of object with outer number type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() throws ApiException {
        OuterComposite outerComposite = null;
        OuterComposite response = api.fakeOuterCompositeSerialize(outerComposite);
        // TODO: test validations
    }

    /**
     * Test serialization of outer number types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() throws ApiException {
        BigDecimal body = null;
        BigDecimal response = api.fakeOuterNumberSerialize(body);
        // TODO: test validations
    }

    /**
     * Test serialization of outer string types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() throws ApiException {
        String body = null;
        String response = api.fakeOuterStringSerialize(body);
        // TODO: test validations
    }

    /**
     * fake reference parameter
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeRefParameterTest() throws ApiException {
        FakeRefParameterPetIdParameter petId = null;
        api.fakeRefParameter(petId);
        // TODO: test validations
    }

    /**
     * fake reference parameter
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fakeUploadRefRequestBodiesTest() throws ApiException {
        Long petId = null;
        String additionalMetadata = null;
        File _file = null;
        ModelApiResponse response = api.fakeUploadRefRequestBodies(petId, additionalMetadata, _file);
        // TODO: test validations
    }

    /**
     * Array of Enums
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFakeArrayofenumsTest() throws ApiException {
        List<OuterEnum> response = api.getFakeArrayofenums();
        // TODO: test validations
    }

    /**
     * Health check endpoint
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFakeHealthTest() throws ApiException {
        HealthCheckResult response = api.getFakeHealth();
        // TODO: test validations
    }

    /**
     * parameter name mapping test
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParameterNameMappingTest() throws ApiException {
        Long underscoreType = null;
        String type = null;
        String typeWithUnderscore = null;
        api.getParameterNameMapping(underscoreType, type, typeWithUnderscore);
        // TODO: test validations
    }

    /**
     * test referenced additionalProperties
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testAdditionalPropertiesReferenceTest() throws ApiException {
        Map<String, Object> requestBody = null;
        api.testAdditionalPropertiesReference(requestBody);
        // TODO: test validations
    }

    /**
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testBodyWithFileSchemaTest() throws ApiException {
        FileSchemaTestClass fileSchemaTestClass = null;
        api.testBodyWithFileSchema(fileSchemaTestClass);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testBodyWithQueryParamsTest() throws ApiException {
        String query = null;
        User user = null;
        api.testBodyWithQueryParams(query, user);
        // TODO: test validations
    }

    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testClientModelTest() throws ApiException {
        Client client = null;
        Client response = api.testClientModel(client);
        // TODO: test validations
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() throws ApiException {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        File binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
        // TODO: test validations
    }

    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testEnumParametersTest() throws ApiException {
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
        // TODO: test validations
    }

    /**
     * Fake endpoint to test group parameters (optional)
     *
     * Fake endpoint to test group parameters (optional)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testGroupParametersTest() throws ApiException {
        Integer requiredStringGroup = null;
        Boolean requiredBooleanGroup = null;
        Long requiredInt64Group = null;
        Integer stringGroup = null;
        Boolean booleanGroup = null;
        Long int64Group = null;
        api.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group)
                .stringGroup(stringGroup)
                .booleanGroup(booleanGroup)
                .int64Group(int64Group)
                .execute();
        // TODO: test validations
    }

    /**
     * test inline additionalProperties
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() throws ApiException {
        Map<String, String> requestBody = null;
        api.testInlineAdditionalProperties(requestBody);
        // TODO: test validations
    }

    /**
     * test inline free-form additionalProperties
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testInlineFreeformAdditionalPropertiesTest() throws ApiException {
        TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest = null;
        api.testInlineFreeformAdditionalProperties(testInlineFreeformAdditionalPropertiesRequest);
        // TODO: test validations
    }

    /**
     * test json serialization of form data
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testJsonFormDataTest() throws ApiException {
        String param = null;
        String param2 = null;
        api.testJsonFormData(param, param2);
        // TODO: test validations
    }

    /**
     * To test the collection format in query parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testQueryParameterCollectionFormatTest() throws ApiException {
        List<String> pipe = null;
        List<String> ioutil = null;
        List<String> http = null;
        List<String> url = null;
        List<String> context = null;
        api.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context);
        // TODO: test validations
    }

    /**
     * test referenced string map
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testStringMapReferenceTest() throws ApiException {
        Map<String, String> requestBody = null;
        api.testStringMapReference(requestBody);
        // TODO: test validations
    }

}
