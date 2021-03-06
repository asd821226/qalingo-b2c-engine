/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.dao;

import java.util.List;

import org.hoteia.qalingo.core.domain.Localization;

public interface LocalizationDao {

	Localization getLocalizationById(Long localizationId, Object... params);

	Localization getLocalizationByCode(String code, Object... params);

	List<Localization> findLocalizations(Object... params);
	
	List<Localization> findLocalizationsByMarketAreaCode(String marketAreaCode, Object... params);
	
	Localization saveOrUpdateLocalization(Localization localization);

	void deleteLocalization(Localization localization);

}
