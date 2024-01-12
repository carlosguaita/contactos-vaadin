package com.contactos.views.listacontactos;

import com.contactos.Utils.Util;
import com.contactos.models.Contacto;
import com.contactos.views.MainLayout;
import com.contactos.views.nuevocontacto.NuevoContactoView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import java.util.List;

@PageTitle("Lista Contactos")
@Route(value = "lista-contactos", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class ListaContactosView extends Composite<VerticalLayout> {

    public ListaContactosView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");


        Grid<Contacto> grid = new Grid<>(Contacto.class, false);
        grid.addColumn(Contacto::getNombre).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(Contacto::getCedula).setHeader("Cedula").setAutoWidth(true);
        grid.addColumn(Contacto::getTelefono).setHeader("Teléfono").setAutoWidth(true);
        grid.addColumn(
                new ComponentRenderer<>(contacto -> {
                    Button botonBorrar = new Button();
                    botonBorrar.addThemeVariants(ButtonVariant.LUMO_ERROR);
                    botonBorrar.addClickListener(e -> {

                        Util.listaContactos.remove(contacto);
                        grid.getDataProvider().refreshAll();
                    });
                    botonBorrar.setIcon(new Icon(VaadinIcon.TRASH));


                    HorizontalLayout buttons = new HorizontalLayout(botonBorrar);
                    return buttons;
                })).setHeader("Manage").setAutoWidth(true);

        List<Contacto> contactos = Util.listaContactos;
        grid.setItems(contactos);
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);

        getContent().add(grid);

    }
}
