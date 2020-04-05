kotling-spring-boot-docker
==

Demo app for k8s deployments.

Prepare k8s

    docker login
    kubectl create secret generic regcred --from-file=.dockerconfigjson=/Users/mika/.docker/config.json --type=kubernetes.io/dockerconfigjson
    

Commands for docker and kubectl:

    docker build -t m1kah/kotlin-spring-boot-docker:1.0.0 . 
    docker push m1kah/kotlin-spring-boot-docker:1.0.0
    kubectl create -f deployment.yml
    kubectl get service
    minikube tunnel

Service is avalable in CLUSTER-IP of k8s service

    curl 10.110.240.6:8080

See also

https://medium.com/faun/building-and-deploying-a-spring-boot-application-to-kubernetes-12da35d1e2fc
https://stackoverflow.com/questions/36232906/how-to-access-private-docker-hub-repository-from-kubernetes-on-vagrant
https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/html/#packaging-executable-configuring-launch-script
