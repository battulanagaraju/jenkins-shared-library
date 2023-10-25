def call(String gitUrl, String gitBranch) {
    checkout([
       git 'https://github.com/battulanagaraju/jenkins-shared-library.git'
    ])
}
