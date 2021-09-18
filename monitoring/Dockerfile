# fluentd/Dockerfile

FROM fluent/fluentd:v1.12.0-debian-1.0
USER root
COPY fluentd/conf/fluent.conf  /fluentd/etc
RUN ["gem", "install", "fluent-plugin-elasticsearch", "--no-document", "--version", "5.0.3"]
USER fluent