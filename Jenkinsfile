// pipeline {
//     agent any

//     stages {

//         stage('Checkout Code') {
//             steps {
//                 git 'https://github.com/PriyanshuSingh21july2021/Java-code.git'
//             }
//         }

//         stage('Compile Java Code') {
//             steps {
//                 echo 'Compiling Java Program...'
//                 sh 'javac Queues.java'
//             }
//         }

//         stage('Run Java Program') {
//             steps {
//                 echo 'Running Java Program...'
//                 sh 'java Queues'
//             }
//         }
//     }

//     post {
//         success {
//             emailext (
//                 subject: "Build Success: ${env.JOB_NAME}",
//                 body: "Build completed successfully.\nBuild URL: ${env.BUILD_URL}",
//                 to: "priyanshusingh88251@gmail.com"
//             )
//         }

//         failure {
//             emailext (
//                 subject: "Build Failed: ${env.JOB_NAME}",
//                 body: "Build failed.\nCheck console output: ${env.BUILD_URL}",
//                 to: "priyanshusingh88251@gmail.com"
//             )
//         }
//     }
// }
