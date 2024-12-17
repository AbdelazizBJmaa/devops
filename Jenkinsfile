pipeline {
   
   agent any
   
   stages {
      stage ('TEST') {
         steps {
             sh './build/mvn.sh mvn test'       
         }
      } 
      stage ('BUILD') {
         steps {
           sh './build/mvn.sh mvn clean package'
           sh './build/buildimage.sh' 
         }
      }
      stage ('PUSH') {
         steps {
            sh './push/push.sh'
         }
      }
   }   

}
