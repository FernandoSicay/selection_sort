pipeline{
	agent any 
	stages{
		stage('Uploading library'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'STARTING DEPLOYING'
				
				rtMavenDeployer (
					id: 'SELECTION_SORT',
					serverId: 'artifactory',
					releaseRepo: 'parcial2-is',
					snapshotRepo: 'parcial2-is',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'SELECTION_SORT'
				)
					echo 'FINING DEPLOYING'
				
			
			}
		}
		stage ('documenting builder artefactory info') {
            steps {
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
	}
}
