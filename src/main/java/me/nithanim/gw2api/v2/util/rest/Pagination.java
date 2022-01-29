package me.nithanim.gw2api.v2.util.rest;

public interface Pagination {
  /**
   * The maximum size a returned page can have. This affects {@link #getPageTotal()} since it is
   * based on this size.
   *
   * @return the maximum size of a page
   */
  int getPageSize();

  /**
   * The number of pages that exist for this resource. This is affected by {@link #getPageSize()}.
   *
   * @return the amount of pages available
   */
  int getPageTotal();

  /**
   * The actual number of items that were returned on this page. It is always smaller or equals
   * {@link #getPageSize()}.
   *
   * @return the number of items actually returned
   */
  int getResultCount();

  /**
   * The toatal number of items that are available to be retrieved.
   *
   * @return the total number of items available
   */
  int getResultTotal();
}
