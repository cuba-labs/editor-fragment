package com.company.demo.web;

import com.company.demo.entity.Client;
import com.haulmont.cuba.gui.screen.*;

@UiController("demo_DiscountFragment")
@UiDescriptor("discount-fragment.xml")
public class DiscountFragment extends ScreenFragment {
    @Subscribe(target = Target.PARENT_CONTROLLER)
    private void onInit(StandardEditor.InitEntityEvent<Client> event) {
        event.getEntity().setDiscount(10);
    }
}