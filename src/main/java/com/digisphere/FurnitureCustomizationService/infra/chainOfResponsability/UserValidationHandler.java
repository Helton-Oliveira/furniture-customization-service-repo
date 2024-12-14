package com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability;

import com.digisphere.FurnitureCustomizationService.infra.apiRequester.ApiRequester;
import com.digisphere.FurnitureCustomizationService.infra.errorHandler.CustomError;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationHandler extends BaseRequestHandler {

    @Override
    public void valid(Map<String, String> fields, List<String> keys) {
        String url = generateUrl(UUID.fromString(fields.get("creatorsId")));
        String response = ApiRequester.getData(url);
        if(response.isBlank()) throw new CustomError("ERRO AO REQUISITAR USUARIO");

        this.next(new MaterialValidationHandler());
    }

    private String generateUrl(UUID id) {
        Matcher matcher = Pattern.compile("[0-9]")
                .matcher(id.toString());

        if(!matcher.find()) throw new CustomError("N/A");

        String userId = matcher.group();
        return "https://jsonplaceholder.typicode.com/users/"+userId;
    }
}
