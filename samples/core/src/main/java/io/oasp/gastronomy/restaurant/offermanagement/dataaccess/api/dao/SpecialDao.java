package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import java.util.List;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

public interface SpecialDao extends ApplicationRevisionedDao<SpecialEntity>, MasterDataDao<SpecialEntity> {

  /**
   * Find active special offers for given date of checking.
   *
   * @param criteria with filled date of checking
   * @return all found active special offers
   */
  List<SpecialEntity> findActiveSpecials(SpecialSearchCriteriaTo criteria);

  /**
   * Find active special offer for given date of checking and given offer number with best (smallest) price.
   *
   * @param criteria with filled date of checking, offer number
   * @return best found special price
   */
  Money findBestActiveSpecial(SpecialSearchCriteriaTo criteria);

  // to juz chyba troche na wyrost...
  /**
   * Finds the {@link SpecialEntity} objects matching the given {@link SpecialSearchCriteriaTo}.
   *
   * @param criteria is the {@link SpecialSearchCriteriaTo}.
   * @return the {@link List} with the matching {@link SpecialEntity} objects.
   */
  PaginatedListTo<SpecialEntity> findSpecials(SpecialSearchCriteriaTo criteria);

}
