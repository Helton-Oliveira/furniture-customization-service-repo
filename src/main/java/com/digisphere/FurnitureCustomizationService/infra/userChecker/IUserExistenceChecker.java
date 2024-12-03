package com.digisphere.FurnitureCustomizationService.infra.userChecker;

import java.util.UUID;

public interface IUserExistenceChecker {
    Boolean doesUserExist(UUID id);
}
