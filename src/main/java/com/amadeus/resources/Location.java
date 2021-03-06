package com.amadeus.resources;

import lombok.Getter;
import lombok.ToString;

/**
 * An Location object as returned by the Locaion API.
 * @see com.amadeus.referenceData.Location#get()
 */
@ToString
public class Location extends Resource {
  protected Location() {}

  private @Getter String type;
  private @Getter String subType;
  private @Getter String name;
  private @Getter String detailedName;
  private @Getter String timeZoneOffset;
  private @Getter String iataCode;
  private @Getter GeoCode geoCode;
  private @Getter Address address;
  private @Getter Distance distance;
  private @Getter Analytics analytics;
  private @Getter Double relevance;

  /**
   * An Location-related object as returned by the Locaion API.
   * @see com.amadeus.referenceData.Location#get()
   */
  @ToString
  private class GeoCode {
    protected GeoCode() {}

    private @Getter double latitude;
    private @Getter double longitude;
  }

  /**
   * An Location-related object as returned by the Locaion API.
   * @see com.amadeus.referenceData.Location#get()
   */
  @ToString
  private class Address {
    protected Address() {}

    private @Getter String cityName;
    private @Getter String cityCode;
    private @Getter String countryName;
    private @Getter String countryCode;
    private @Getter String regionCode;
  }

  /**
   * An Location-related object as returned by the Locaion API.
   * @see com.amadeus.referenceData.Location#get()
   */
  @ToString
  private class Distance {
    protected Distance() {}

    private @Getter Double value;
    private @Getter String unit;
  }

  /**
   * An Location-related object as returned by the Locaion API.
   * @see com.amadeus.referenceData.Location#get()
   */
  @ToString
  private class Analytics {
    protected Analytics() {}

    private @Getter Flights flights;
    private @Getter Travellers travellers;

    /**
     * An Location-related object as returned by the Locaion API.
     * @see com.amadeus.referenceData.Location#get()
     */
    @ToString
    private class Flights {
      protected Flights() {}

      private @Getter Double score;
    }

    /**
     * An Location-related object as returned by the Locaion API.
     * @see com.amadeus.referenceData.Location#get()
     */
    @ToString
    private class Travellers {
      protected Travellers() {}

      private @Getter Double score;
    }
  }
}
