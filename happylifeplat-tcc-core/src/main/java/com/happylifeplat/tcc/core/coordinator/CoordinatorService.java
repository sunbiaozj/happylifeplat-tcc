/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.happylifeplat.tcc.core.coordinator;


import com.happylifeplat.tcc.common.config.TccConfig;
import com.happylifeplat.tcc.core.bean.entity.TccTransaction;
import com.happylifeplat.tcc.core.coordinator.command.CoordinatorAction;

public interface CoordinatorService {

    /**
     * 启动本地补偿事务，根据配置是否进行补偿
     *
     * @param tccConfig 配置信息
     * @throws Exception 异常
     */
    void start(TccConfig tccConfig) throws Exception;

    /**
     * 保存补偿事务信息
     *
     * @param tccTransaction 实体对象
     * @return 主键id
     */
    String save(TccTransaction tccTransaction);

    TccTransaction findByTransId(String transId);


    /**
     * 删除补偿事务信息
     *
     * @param id 主键id
     * @return true成功 false 失败
     */
    boolean remove(String id);


    /**
     * 更新
     *
     * @param tccTransaction 实体对象
     */
    void update(TccTransaction tccTransaction);

    /**
     * 提交补偿操作
     *
     * @param coordinatorAction 执行动作
     */
    Boolean submit(CoordinatorAction coordinatorAction);
}
