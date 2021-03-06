/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.marketplace;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstalledAddOn extends Resource {
    private static final long serialVersionUID = 59619174394820L;

    /**
     * Create a InstalledAddOnCreator to execute create.
     * 
     * @param availableAddOnSid A string that uniquely identifies the Add-on to
     *                          install
     * @param acceptTermsOfService A boolean reflecting your acceptance of the
     *                             Terms of Service
     * @return InstalledAddOnCreator capable of executing the create
     */
    public static InstalledAddOnCreator creator(final String availableAddOnSid, 
                                                final Boolean acceptTermsOfService) {
        return new InstalledAddOnCreator(availableAddOnSid, acceptTermsOfService);
    }

    /**
     * Create a InstalledAddOnDeleter to execute delete.
     * 
     * @param pathSid The Installed Add-on Sid to delete
     * @return InstalledAddOnDeleter capable of executing the delete
     */
    public static InstalledAddOnDeleter deleter(final String pathSid) {
        return new InstalledAddOnDeleter(pathSid);
    }

    /**
     * Create a InstalledAddOnFetcher to execute fetch.
     * 
     * @param pathSid The unique Installed Add-on Sid
     * @return InstalledAddOnFetcher capable of executing the fetch
     */
    public static InstalledAddOnFetcher fetcher(final String pathSid) {
        return new InstalledAddOnFetcher(pathSid);
    }

    /**
     * Create a InstalledAddOnUpdater to execute update.
     * 
     * @param pathSid The sid
     * @return InstalledAddOnUpdater capable of executing the update
     */
    public static InstalledAddOnUpdater updater(final String pathSid) {
        return new InstalledAddOnUpdater(pathSid);
    }

    /**
     * Create a InstalledAddOnReader to execute read.
     * 
     * @return InstalledAddOnReader capable of executing the read
     */
    public static InstalledAddOnReader reader() {
        return new InstalledAddOnReader();
    }

    /**
     * Converts a JSON String into a InstalledAddOn object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return InstalledAddOn object represented by the provided JSON
     */
    public static InstalledAddOn fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InstalledAddOn.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a InstalledAddOn object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return InstalledAddOn object represented by the provided JSON
     */
    public static InstalledAddOn fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InstalledAddOn.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final String description;
    private final Map<String, Object> configuration;
    private final String uniqueName;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private InstalledAddOn(@JsonProperty("sid")
                           final String sid, 
                           @JsonProperty("account_sid")
                           final String accountSid, 
                           @JsonProperty("friendly_name")
                           final String friendlyName, 
                           @JsonProperty("description")
                           final String description, 
                           @JsonProperty("configuration")
                           final Map<String, Object> configuration, 
                           @JsonProperty("unique_name")
                           final String uniqueName, 
                           @JsonProperty("date_created")
                           final String dateCreated, 
                           @JsonProperty("date_updated")
                           final String dateUpdated, 
                           @JsonProperty("url")
                           final URI url, 
                           @JsonProperty("links")
                           final Map<String, String> links) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.description = description;
        this.configuration = configuration;
        this.uniqueName = uniqueName;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The A string that uniquely identifies this Add-on installation.
     * 
     * @return A string that uniquely identifies this Add-on installation
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The Account id that has installed this Add-on.
     * 
     * @return The Account id that has installed this Add-on
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The A description of this Add-on installation.
     * 
     * @return A description of this Add-on installation
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The A short description of the Add-on functionality.
     * 
     * @return A short description of the Add-on functionality
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * Returns The The JSON object representing the current configuration.
     * 
     * @return The JSON object representing the current configuration
     */
    public final Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    /**
     * Returns The The string that uniquely identifies this Add-on installation.
     * 
     * @return The string that uniquely identifies this Add-on installation
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The The date this Add-on installation was created.
     * 
     * @return The date this Add-on installation was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this Add-on installation was last updated.
     * 
     * @return The date this Add-on installation was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The A dictionary of URLs for related resource..
     * 
     * @return A dictionary of URLs for related resource.
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InstalledAddOn other = (InstalledAddOn) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(description, other.description) && 
               Objects.equals(configuration, other.configuration) && 
               Objects.equals(uniqueName, other.uniqueName) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(url, other.url) && 
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            description,
                            configuration,
                            uniqueName,
                            dateCreated,
                            dateUpdated,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("friendlyName", friendlyName)
                          .add("description", description)
                          .add("configuration", configuration)
                          .add("uniqueName", uniqueName)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}