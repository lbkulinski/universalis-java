/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) Rainbowdashlabs and Contributor
 */

package de.chojo.universalis;

import de.chojo.universalis.rest.UniversalisRest;
import de.chojo.universalis.rest.response.WorldsResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class WorldsRequestImplTest {

    UniversalisRest rest = UniversalisRest.defaultApi();

    @Test
    public void test() {
        WorldsResponse complete = rest.worlds().complete();
        assertFalse(complete.worlds().isEmpty());
    }

}
