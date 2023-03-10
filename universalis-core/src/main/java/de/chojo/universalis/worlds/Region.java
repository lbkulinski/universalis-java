/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) Rainbowdashlabs and Contributor
 */

package de.chojo.universalis.worlds;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a region containing multiple datacenters
 */
public interface Region extends WorldProvider {
    /**
     * Gets a list of all datacenters in this region.
     *
     * @return unmodifiable datecenter list
     */
    List<DataCenter> datacenters();

    /**
     * Name of the region
     *
     * @return region
     */
    String name();

    /**
     * Get a list of all worlds in this datacenter.
     *
     * @return unmodifiable world list
     */
    @Override
    default List<World> worlds() {
        List<World> worlds = new ArrayList<>();
        for (DataCenter datacenter : datacenters()) {
            worlds.addAll(datacenter.worlds());
        }
        return worlds;
    }
}
