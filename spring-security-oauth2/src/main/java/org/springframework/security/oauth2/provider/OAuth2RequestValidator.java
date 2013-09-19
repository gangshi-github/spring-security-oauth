package org.springframework.security.oauth2.provider;

import java.util.Set;

import org.springframework.security.oauth2.common.exceptions.InvalidScopeException;
import org.springframework.security.oauth2.provider.endpoint.AuthorizationEndpoint;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;

/**
 * Validation interface for OAuth2 requests to the {@link AuthorizationEndpoint} and {@link TokenEndpoint}.
 * 
 * @author Amanda Anganes
 *
 */
public interface OAuth2RequestValidator {

	/**
	 * Ensure that the client has requested a valid set of scopes.
	 * 
	 * @param parameters the parameters on the request, including scope
	 * @param clientScopes the requesting client's registered, allowed scopes
	 * @throws InvalidScopeException if a requested scope is invalid
	 */
	public void validateScope(Set<String> requestScopes, ClientDetails client) throws InvalidScopeException;
	
}
