package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import javax.inject.Named;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;

/**
 * @author annoga
 *
 */
@Named
public class SpecialDaoImpl extends ApplicationMasterDataDaoImpl<SpecialEntity> implements SpecialDao {

  @Override
  protected Class<SpecialEntity> getEntityClass() {

    // TODO Auto-generated method stub
    return SpecialEntity.class;
    // zwraca jaka klasa implementuje ten interfejs
    // takie torche na sztywno, ale tak to dziala
    // generyki w javie nie dzialaja najlepiej
  }

}
