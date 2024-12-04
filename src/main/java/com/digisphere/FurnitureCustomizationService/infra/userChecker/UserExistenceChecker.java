package com.digisphere.FurnitureCustomizationService.infra.userChecker;

import com.digisphere.FurnitureCustomizationService.infra.apiRequester.ApiRequester;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserExistenceChecker implements IUserExistenceChecker {

    @Override
    public Boolean doesUserExist(UUID id) {
        String url = generateUrl(id);
        String response = ApiRequester.getData(url);
        if(response.isBlank()) throw new RuntimeException("ERRO AO REQUISITAR USUARIO");
        return true;
    }

    private String generateUrl(UUID id) {
        Matcher matcher = Pattern.compile("[0-9]")
                .matcher(id.toString());

        if(!matcher.find()) throw new RuntimeException("N/A");

        String userId = matcher.group();
        return "https://jsonplaceholder.typicode.com/users/"+userId;
    }
}
