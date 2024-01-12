package com.contactos.views.nuevocontacto;

import com.contactos.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Nuevo Contacto")
@Route(value = "nuevo-contacto", layout = MainLayout.class)
@Uses(Icon.class)
public class NuevoContactoView extends Composite<VerticalLayout> {

    TextField tfNombre;
    TextField tfTelefono;
    TextField tfDireccion;

    TextField tfCedula;


    public NuevoContactoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        tfNombre = new TextField();
        tfTelefono = new TextField();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        tfDireccion = new TextField();
        tfCedula = new TextField();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button btGuardar = new Button();
        Button btCancelar = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        tfNombre.setLabel("Nombre");
        tfNombre.setWidth("min-content");
        tfTelefono.setLabel("Teléfono");
        tfTelefono.setWidth("min-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        tfDireccion.setLabel("Dirección");
        tfDireccion.setWidth("min-content");
        tfCedula.setLabel("Cédula");
        tfCedula.setWidth("min-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        btGuardar.setText("Guardar");
        btGuardar.setWidth("min-content");
        btGuardar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        btCancelar.setText("Cancelar");
        btCancelar.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(tfNombre);
        layoutRow.add(tfTelefono);
        getContent().add(layoutRow2);
        layoutRow2.add(tfDireccion);
        layoutRow2.add(tfCedula);
        getContent().add(layoutRow3);
        layoutRow3.add(btGuardar);
        layoutRow3.add(btCancelar);
    }
}
