job('test') {
  steps {
    sh "echo ${SECRET}"
  }
}
