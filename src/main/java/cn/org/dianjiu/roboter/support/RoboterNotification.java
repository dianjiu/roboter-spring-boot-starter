/*
 * Copyright ©2015-2020 Jaemon. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.org.dianjiu.roboter.support;


import cn.org.dianjiu.roboter.common.RoboterRequest;
import cn.org.dianjiu.roboter.common.RoboterResponse;
import cn.org.dianjiu.roboter.common.enums.MessageType;
import cn.org.dianjiu.roboter.common.enums.RoboterType;

/**
 * Roboter notification
 *
 * @author Dianjiu
 * @since 1.0
 */
public interface RoboterNotification {


    RoboterResponse send(RoboterType roboterType, MessageType messageType, RoboterRequest roboterRequest);

}