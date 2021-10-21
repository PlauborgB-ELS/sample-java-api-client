/*
 * Pure API
 * This is an early access version of the new Pure write API.
 *
 * The version of the OpenAPI document: 0.1 Early Access
 * Contact: b.plauborg@elsevier.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elsevier.pure.api.sample.stubs.api;

import com.elsevier.pure.api.sample.stubs.invoker.ApiException;
import com.elsevier.pure.api.sample.stubs.model.ProblemDetails;
import com.elsevier.pure.api.sample.stubs.model.Roles;
import java.util.UUID;
import com.elsevier.pure.api.sample.stubs.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleApi
 */
@Ignore
public class RoleApiTest {

    private final RoleApi api = new RoleApi();

    
    /**
     * Add roles to user
     *
     * Add roles to user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRolesTest() throws ApiException {
        UUID uuid = null;
        Roles roles = null;
        User response = api.addRoles(uuid, roles);

        // TODO: test validations
    }
    
}
