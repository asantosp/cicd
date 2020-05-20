pipeline{
    agent any
    
    stages{
//    	stage("Unit tests"){
//    	    steps{
//    	    	sh 'mvn test'       	        
//    	    }    	    
//    	}
//        stage("Sonarqube analysis"){
//            steps{
//                withSonarQubeEnv('Sonarqube Server'){
//                	sh 'mvn sonar:sonar'                    
//	            }                
//    	     }
//    	 }
    	 stage("Package, create the image with docker, and push it to azure container"){
	    	 steps{
	    	     sh '''
	    	     mvn clean package
	    	     docker build --tag pataton .
	    	     docker login cicdcontainerregistry.azurecr.io -u cicdcontainerregistry -p 1guXIOBoro2W/4DJvOmi1bhuvdv3bs2R
	    	     docker tag pataton cicdcontainerregistry.azurecr.io/pataton
	    	     docker push cicdcontainerregistry.azurecr.io/pataton
	    	     '''
	    	 }	    	                             
    	 }
    }
}


// 1. Version working without Docker containers
//
//pipeline {
//	agent any
//
////	environment {
////		IMAGE = 'registry.gitlab.com/XXXXX/bible-server'
////		DOCKER_REGISTRY_CREDENTIALS = credentials('DOCKER_REGISTRY_CREDENTIALS')
////	}
//	stages {
//		stage("Build and Sonarqube analysis") {
//			steps {
//				withSonarQubeEnv('Sonarqube Server'){
//				    sh '''
//				    	mvn clean package sonar:sonar
//				    	cd target
//				    	cp *.war ROOT.war
//				    '''
//				}
//			}
//		}
////		stage("Quality gate"){
////		    steps{
////		        timeout(time: 1, unit: 'HOURS'){
////		        	waitForQualityGate abortPipeline: true		                             
////                 }
////		    }    
////		}
//		stage("Deploy"){
//			steps{
//			    azureWebAppPublish azureCredentialsId: env.AZURE_CRED_ID,
//		    	resourceGroup: env.RES_GROUP, appName: env.WEB_APP, filePath:"**/ROOT.war"
//			}
//		}
//		
//	}
//}
// 2. How to send emails when success or failure
//post {
//	success {
//		mail to: "adrian.santos1987@gmail.com", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "The compilation and deployment succeded."
//    }
//    failure {
//		mail to: "adrian.santos1987@gmail.com", subject:"FAILURE: ${currentBuild.fullDisplayName}", body: "The compilation and deployment failed."
//    }
//}



