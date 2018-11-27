package io.oasp.gastronomy.restaurant.offermanagement.logic.impl;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import io.oasp.gastronomy.restaurant.SpringBootApp;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author annoga
 *
 */
@Transactional
@SpringBootTest(classes = { SpringBootApp.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpecialOfferTest extends ComponentTest {
  // bez tego extenda nie bedzie uruchamial spring boota
  @Inject
  private SpecialDao specialDao;

  @Test
  public void test() throws Exception {

    SpecialEntity entity = new SpecialEntity();
    entity.setName("nazwa");

    OfferEntity offer = new OfferEntity();
    entity.setOffer(offer);

    WeeklyPeriodEmbeddable activePeriod = new WeeklyPeriodEmbeddable();
    entity.setActivePeriod(activePeriod);

    Money specialPrice = new Money();
    entity.setSpecialPrice(specialPrice);

    // entity.setId(1L);

    this.specialDao.save(entity);

    assertTrue(entity.getId() == 1L);
    // assertThat()
    // assertTrue(true);

  }
}
