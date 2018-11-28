package io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype;

/**
 * @author annoga
 *
 */
public enum SpecialSortByHitEntry {

  /**
   * Sort by id.
   */
  ID("id"),
  /**
   * Sort by description.
   */
  DESCRIPTION("description"),
  /**
   * Sort by price.
   */
  PRICE("price"),
  /**
   * Sort by meal.
   */
  MEAL("meal"),
  /**
   * Sort by side dish.
   */
  SIDEDISH("sideDish"),
  /**
   * Sort by drink.
   */
  DRINK("drink");

  private final String sortByAttributeName;

  private SpecialSortByHitEntry(String sortByAttributeName) {

    this.sortByAttributeName = sortByAttributeName;
  }

  /**
   * @return sortByAttributeName
   */
  public String getSortByAttributeName() {

    return this.sortByAttributeName;
  }

  /**
   * This method returns an {@link OfferSortByHitEntry} for a given {@link #getSortByAttributeName() attribute name}.
   *
   * @param sortByAttributeName the name.
   * @return an {@link OfferSortByHitEntry}
   */
  public static SpecialSortByHitEntry getEntryForAttributeName(String sortByAttributeName) {

    for (SpecialSortByHitEntry entry : SpecialSortByHitEntry.values()) {
      if (entry.sortByAttributeName.equals(sortByAttributeName)) {
        return entry;
      }
    }

    return null;
  }
}
