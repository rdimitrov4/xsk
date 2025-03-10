# Docker descriptor for XSK
# Copyright (c) 2022 SAP SE or an SAP affiliate company and XSK contributors

# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, v2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
  
# SPDX-FileCopyrightText: 2022 SAP SE or an SAP affiliate company and XSK contributors
# SPDX-License-Identifier: Apache-2.0

# (Optional) JDK_TYPE could be `default-jdk` or `external-jdk`
ARG JDK_TYPE=default-jdk

FROM tomcat:9.0.56-jre17-temurin AS base

FROM base AS xsk-external-jdk
# If JDK_TYPE is set to `external-jdk`, then the JDK_HOME is required and it should point to the home directory of the jdk
ARG JDK_HOME
RUN echo "Using external JDK"
COPY $JDK_HOME /usr/local/jdk
ENV JAVA_HOME=/usr/local/jdk
ENV JRE_HOME=/usr/local/jdk

FROM base AS xsk-default-jdk
RUN echo "The default OpenJDK will be used"

FROM xsk-${JDK_TYPE} AS dependencies-base

COPY target/ROOT.war $CATALINA_HOME/webapps/

RUN  apt-get update \
  && apt-get install -y wget

RUN wget https://repo1.maven.org/maven2/org/postgresql/postgresql/42.1.4/postgresql-42.1.4.jar -P /usr/local/tomcat/lib/
RUN wget https://repo1.maven.org/maven2/com/sap/cloud/db/jdbc/ngdbc/2.8.12/ngdbc-2.8.12.jar -P /usr/local/tomcat/lib/

ENV DIRIGBLE_JAVASCRIPT_GRAALVM_DEBUGGER_PORT=0.0.0.0:8081
ENV CATALINA_OPTS="--add-opens java.base/java.lang.reflect=ALL-UNNAMED"

RUN apt-get update && \
    apt-get install -y git && \
    apt-get clean

EXPOSE 8080

CMD ["catalina.sh", "jpda", "run"]