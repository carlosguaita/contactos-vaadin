package com.contactos.views.detallecontacto;

import com.contactos.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Detalle Contacto")
@Route(value = "detalle-contacto", layout = MainLayout.class)
@Uses(Icon.class)
public class DetalleContactoView extends Composite<VerticalLayout> {

    public DetalleContactoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H3 h3 = new H3();
        H3 h32 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H3 h33 = new H3();
        H3 h34 = new H3();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H3 h35 = new H3();
        H3 h36 = new H3();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        H3 h37 = new H3();
        H3 h38 = new H3();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h3.setText("Nombre:");
        h3.setWidth("max-content");
        h32.setText("Heading");
        h32.setWidth("max-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        h33.setText("Cédula:");
        h33.setWidth("max-content");
        h34.setText("Heading");
        h34.setWidth("max-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        h35.setText("Teléfono:");
        h35.setWidth("max-content");
        h36.setText("Heading");
        h36.setWidth("max-content");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("min-content");
        h37.setText("Dirección:");
        h37.setWidth("max-content");
        h38.setText("Heading");
        h38.setWidth("max-content");
        buttonPrimary.setText("Cancelar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h3);
        layoutRow.add(h32);
        getContent().add(layoutRow2);
        layoutRow2.add(h33);
        layoutRow2.add(h34);
        getContent().add(layoutRow3);
        layoutRow3.add(h35);
        layoutRow3.add(h36);
        getContent().add(layoutRow4);
        layoutRow4.add(h37);
        layoutRow4.add(h38);
        getContent().add(buttonPrimary);
    }
}
