"# gcp-runtime-configuration-sample" 

Run  
mvn appengine:run

Deploy  
mvn appengine:deploy

GCP Project commands   
* gcloud config list
* gcloud projects list
* gcloud config set project spring-cloud-gcp-config-sample

GCP Runtime Config commands
* gcloud beta runtime-config configs variables list --config-name myapp_prod
* gcloud beta runtime-config configs variables set myapp.queue-size 300 --config-name myapp_prod
* gcloud beta runtime-config configs variables set myapp.feature-x-enabled true --config-name myapp_prod
* gcloud beta runtime-config configs variables get-value myapp.queue-size --config-name myapp_prod
* gcloud beta runtime-config configs variables get-value myapp.feature-x-enabled --config-name myapp_prod