/*
 * jGnash, a personal finance application
 * Copyright (C) 2001-2016 Craig Cavanaugh
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jgnash.engine.dao;

import java.util.List;

import jgnash.engine.StoredObject;

/**
 * Engine DAO Interface.
 *
 * @author Craig Cavanaugh
 */
public interface EngineDAO {

    AccountDAO getAccountDAO();

    BudgetDAO getBudgetDAO();

    CommodityDAO getCommodityDAO();

    ConfigDAO getConfigDAO();

    RecurringDAO getRecurringDAO();

    TransactionDAO getTransactionDAO();

    TrashDAO getTrashDAO();

    <T> T getObjectByUuid(Class<T> tClass, final String uuid);

    List<StoredObject> getStoredObjects();

    <T extends StoredObject> List<T> getStoredObjects(Class<T> tClass);

    /**
     * Force the object to be reloaded from the underlying database.
     * <p>
     * Intended for client / server use.
     *
     * @param object object to refresh
     */
    void refresh(StoredObject object);

    void shutdown();
}