package com.digisphere.FurnitureCustomizationService.application.facadePattern;

import com.digisphere.FurnitureCustomizationService.application.bookcase.domain.BookCase;
import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;
import com.digisphere.FurnitureCustomizationService.application.chair.domain.Chair;
import com.digisphere.FurnitureCustomizationService.application.order.domain.Order;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;

import java.util.Map;

public interface IDirectorsFacade {
    Table createTable(Map<String, String> reqData);
    BookCase createBookCase(Map<String, String> reqData);
    Chair createChair(Map<String, String> reqData);
    Cabinet createCabinet(Map<String, String> reqData);
    Order createOrder(Map<String, String> reData);
}
