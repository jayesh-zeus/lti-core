package edu.uoc.lti.accesstoken;

public interface AccessTokenRequestBuilder {
  /**
   * Returns the request for obtaing the access token
   * @param request request to build
   * @return string with the request to pass to the authorization server
   */
  String build(AccessTokenRequest request);

  /**
   * Gets the content type of the request to the authorization server
   * @return the content type of the request to the authorization server
   */
  String getContentType();
}