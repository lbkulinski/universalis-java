/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) Rainbowdashlabs and Contributor
 */

package de.chojo.universalis.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.chojo.universalis.deserializer.SecondsDateTimeConverter;
import de.chojo.universalis.rest.response.extra.stats.LeastRecentlyUpdatedResponse;
import de.chojo.universalis.rest.response.extra.stats.MostRecentlyUpdatedResponse;
import de.chojo.universalis.worlds.World;

import java.time.LocalDateTime;

/**
 * Items used in {@link LeastRecentlyUpdatedResponse} and {@link MostRecentlyUpdatedResponse}
 *
 * @param item    item
 * @param updated updated
 * @param world   world
 */
public record WorldItemRecently(@JsonProperty("itemID") Item item,
                                @JsonProperty("lastUploadTime") @JsonDeserialize(converter = SecondsDateTimeConverter.class) LocalDateTime updated,
                                @JsonProperty("worldID") World world) {
}
