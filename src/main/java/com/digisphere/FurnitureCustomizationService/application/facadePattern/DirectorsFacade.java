package com.digisphere.FurnitureCustomizationService.application.facadePattern;

import com.digisphere.FurnitureCustomizationService.application.bookcase.bookcaseBuilder.BookCaseDirector;
import com.digisphere.FurnitureCustomizationService.application.bookcase.bookcaseBuilder.IBookCaseDirector;
import com.digisphere.FurnitureCustomizationService.application.bookcase.domain.BookCase;
import com.digisphere.FurnitureCustomizationService.application.cabinet.cabinetBuilder.CabinetDirector;
import com.digisphere.FurnitureCustomizationService.application.cabinet.cabinetBuilder.ICabinetDirector;
import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;
import com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder.ChairDirector;
import com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder.IChairDirector;
import com.digisphere.FurnitureCustomizationService.application.chair.domain.Chair;
import com.digisphere.FurnitureCustomizationService.application.order.domain.Order;
import com.digisphere.FurnitureCustomizationService.application.order.orderBuilder.IOrderDirector;
import com.digisphere.FurnitureCustomizationService.application.order.orderBuilder.OrderDirector;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.tableBuilder.ITableDirector;
import com.digisphere.FurnitureCustomizationService.application.table.tableBuilder.TableDirector;

import java.util.Map;

public class DirectorsFacade implements IDirectorsFacade {
    private final IChairDirector chairDirector = new ChairDirector();
    private final IBookCaseDirector bookCaseDirector = new BookCaseDirector();
    private final ITableDirector tableDirector = new TableDirector();
    private final ICabinetDirector cabinetDirector = new CabinetDirector();
    private final IOrderDirector orderDirector = new OrderDirector();

    @Override
    public Table createTable(Map<String, String> reqData) {
        return tableDirector.createTable(reqData);
    }

    @Override
    public BookCase createBookCase(Map<String, String> reqData) {
        return bookCaseDirector.createBookCase(reqData);
    }

    @Override
    public Chair createChair(Map<String, String> reqData) {
        return chairDirector.createChair(reqData);
    }

    @Override
    public Cabinet createCabinet(Map<String, String> reqData) {
        return cabinetDirector.createCloset(reqData);
    }

    @Override
    public Order createOrder(Map<String, String> reData) {
        return orderDirector.createOrder(reData);
    }
}
