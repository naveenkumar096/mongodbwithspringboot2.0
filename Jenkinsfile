node{

stage('SCM checkout'){
git 'https://github.com/naveenkumar096/mongodbwithspringboot2.0'
}
stage('Compile-Package'){
def mvnHome= tool name: 'maven', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
}

}
