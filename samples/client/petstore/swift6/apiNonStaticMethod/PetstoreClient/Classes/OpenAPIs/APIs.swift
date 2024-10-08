// APIs.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(FoundationNetworking)
import FoundationNetworking
#endif
import Alamofire

open class PetstoreClientAPI: @unchecked Sendable {
    private init() {}
    public static let shared = PetstoreClientAPI()

    public var basePath = "http://petstore.swagger.io:80/v2"
    public var customHeaders: [String: String] = [:]
    public var credential: URLCredential?
    public var requestBuilderFactory: RequestBuilderFactory = AlamofireRequestBuilderFactory()
    public var apiResponseQueue: DispatchQueue = .main
    /// Configures the range of HTTP status codes that will result in a successful response
    ///
    /// If a HTTP status code is outside of this range the response will be interpreted as failed.
    public var successfulStatusCodeRange: Range = 200..<300
    /// ResponseSerializer that will be used by the generator for `Data` responses
    ///
    /// If unchanged, Alamofires default `DataResponseSerializer` will be used. 
    public var dataResponseSerializer: AnyResponseSerializer<Data> = AnyResponseSerializer(DataResponseSerializer())
    /// ResponseSerializer that will be used by the generator for `String` responses
    ///
    /// If unchanged, Alamofires default `StringResponseSerializer` will be used. 
    public var stringResponseSerializer: AnyResponseSerializer<String> = AnyResponseSerializer(StringResponseSerializer())
}

open class RequestBuilder<T>: @unchecked Sendable {
    var credential: URLCredential?
    var headers: [String: String]
    public let parameters: [String: Any]?
    public let method: String
    public let URLString: String
    public let requestTask: RequestTask = RequestTask()
    public let requiresAuthentication: Bool

    /// Optional block to obtain a reference to the request's progress instance when available.
    public var onProgressReady: ((Progress) -> Void)?

    required public init(method: String, URLString: String, parameters: [String: Any]?, headers: [String: String] = [:], requiresAuthentication: Bool) {
        self.method = method
        self.URLString = URLString
        self.parameters = parameters
        self.headers = headers
        self.requiresAuthentication = requiresAuthentication

        addHeaders(PetstoreClientAPI.shared.customHeaders)
    }

    open func addHeaders(_ aHeaders: [String: String]) {
        for (header, value) in aHeaders {
            headers[header] = value
        }
    }

    @discardableResult
    open func execute(_ apiResponseQueue: DispatchQueue = PetstoreClientAPI.shared.apiResponseQueue, _ completion: @Sendable @escaping (_ result: Swift.Result<Response<T>, ErrorResponse>) -> Void) -> RequestTask {
        return requestTask
    }

    @available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 6.0, *)
    @discardableResult
    open func execute() async throws(ErrorResponse) -> Response<T> {
        do {
            let requestTask = self.requestTask
            return try await withTaskCancellationHandler {
                try Task.checkCancellation()
                return try await withCheckedThrowingContinuation { continuation in
                    guard !Task.isCancelled else {
                      continuation.resume(throwing: CancellationError())
                      return
                    }

                    self.execute { result in
                        switch result {
                        case let .success(response):
                            nonisolated(unsafe) let response = response
                            continuation.resume(returning: response)
                        case let .failure(error):
                            continuation.resume(throwing: error)
                        }
                    }
                }
            } onCancel: {
                requestTask.cancel()
            }
        } catch {
            if let errorResponse = error as? ErrorResponse {
                throw errorResponse
            } else {
                throw ErrorResponse.error(-3, nil, nil, error)
            }
        }
    }
    
    public func addHeader(name: String, value: String) -> Self {
        if !value.isEmpty {
            headers[name] = value
        }
        return self
    }

    open func addCredential() -> Self {
        credential = PetstoreClientAPI.shared.credential
        return self
    }
}

public protocol RequestBuilderFactory {
    func getNonDecodableBuilder<T>() -> RequestBuilder<T>.Type
    func getBuilder<T: Decodable>() -> RequestBuilder<T>.Type
}
