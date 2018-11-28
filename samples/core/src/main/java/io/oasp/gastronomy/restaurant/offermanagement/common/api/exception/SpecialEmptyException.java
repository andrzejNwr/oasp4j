package io.oasp.gastronomy.restaurant.offermanagement.common.api.exception;

import io.oasp.gastronomy.restaurant.general.common.api.NlsBundleApplicationRoot;
import io.oasp.gastronomy.restaurant.general.common.api.exception.ApplicationBusinessException;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;

/**
 * @author annoga
 *
 */
public class SpecialEmptyException extends ApplicationBusinessException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   *
   * @param offer is the empty {@link Offer}.
   */
  public SpecialEmptyException(Special special) {

    super(createBundle(NlsBundleApplicationRoot.class).errorSpecialEmpty());
  }

}
