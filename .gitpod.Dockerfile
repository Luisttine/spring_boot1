FROM gitpod/workkspace-mysql

USER gitpod

RUN /bin/hash -c ". /home/gitpod/.sdkman/bin/-sdkman-init.sh \
        && sdk install java 17.0.8-oracle < /dev/null \
        && sdk flush archives \
        && sdk flush temp"