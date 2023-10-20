/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.aouzen.tpcustomeraouzen.jsf;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;
import ma.aouzen.tpcustomeraouzen.entity.Discount;
import ma.aouzen.tpcustomeraouzen.service.DiscountManager;

/**
 *
 * @author PC
 */
@FacesConverter(value = "discountConverter", managed=true)
public class DiscountConverter implements Converter<Discount>{
    @Inject
  private DiscountManager discountManager;

    @Override
  public Discount getAsObject(FacesContext context, UIComponent component, String value) {
    if (value == null) return null;
    return discountManager.findById(value);
  }

  /**
   * Convertit un Discount en String.
   *
   * @param value valeur à convertir
   */
  @Override
  public String getAsString(FacesContext context, UIComponent component, Discount discount) {
    if (discount == null) return "";
    return discount.getCode();
  }
    
}
