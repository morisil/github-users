/*
 * github-users - lists GitHub users. Minimal app demonstrating
 * cross-platform development (Web, Android, iOS) on top of
 * Java to JavaScript and Java to Objective-C transpilers.
 *
 * Copyright (C) 2017  Kazimierz Pogoda
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.xemantic.githubusers.service;

import com.xemantic.githubusers.model.SearchResult;
import rx.Single;

/**
 * User search service according to
 * <a href="https://developer.github.com/v3/search/#search-users">GitHub API</a>.
 *
 * @author morisil
 */
public interface UserSearchService {

	Single<SearchResult> find(String query, int page, int perPage);

}