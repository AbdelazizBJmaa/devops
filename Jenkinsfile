pipeline {
   
   agent any
   
   stages {
      stage ('TEST') {
         steps {
             sh 'sudo ./build/mvn.sh mvn test'       
         }
      } 
      stage ('BUILD') {
         steps {
           sh 'sudo ./build/mvn.sh mvn clean package'
           sh 'sudo ./build/buildimage.sh' 
         }
      }
      stage ('PUSH') {
         steps {
            sh 'sudo ./push/push.sh'
         }
      }
   }   

}
