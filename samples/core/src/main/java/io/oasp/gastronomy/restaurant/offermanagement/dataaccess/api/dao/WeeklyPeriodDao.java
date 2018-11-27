package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SideDishEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author annoga
 *
 */
public interface WeeklyPeriodDao extends ApplicationRevisionedDao<SideDishEntity>, MasterDataDao<SideDishEntity> {

}
