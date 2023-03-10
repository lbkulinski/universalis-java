/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) Rainbowdashlabs and Contributor
 */

package de.chojo.universalis.entities;

import javax.annotation.Nullable;

/**
 * Represents the creator of a listing
 *
 * @param name name of creator
 * @param id   hashed id of the creator
 */
public record Creator(@Nullable String name, String id) {
}
