package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import java.util.List;

import net.sf.mmm.util.exception.api.ObjectNotFoundException;
import net.sf.mmm.util.exception.api.ObjectNotFoundUserException;

import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SideDishEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.WeeklyPeriodDao;
import io.oasp.module.jpa.dataaccess.api.RevisionMetadata;

/**
 * @author annoga
 *
 */
public class WeeklyPeriodDaoImpl implements WeeklyPeriodDao {

  @Override
  public SideDishEntity save(SideDishEntity entity) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void save(Iterable<? extends SideDishEntity> entities) {

    // TODO Auto-generated method stub

  }

  @Override
  public SideDishEntity find(Long id) throws ObjectNotFoundUserException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SideDishEntity findOne(Long id) throws IllegalArgumentException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean exists(Long id) {

    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<SideDishEntity> findAll(Iterable<Long> ids) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Long id) throws IllegalArgumentException {

    // TODO Auto-generated method stub

  }

  @Override
  public void delete(SideDishEntity entity) {

    // TODO Auto-generated method stub

  }

  @Override
  public void delete(Iterable<? extends SideDishEntity> entities) {

    // TODO Auto-generated method stub

  }

  @Override
  public void forceIncrementModificationCounter(SideDishEntity entity) {

    // TODO Auto-generated method stub

  }

  @Override
  public List<Number> getRevisionHistory(Long id) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<RevisionMetadata> getRevisionHistoryMetadata(Object id) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SideDishEntity load(Long id, Number revision) throws ObjectNotFoundException {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<SideDishEntity> findAll() {

    // TODO Auto-generated method stub
    return null;
  }

}
