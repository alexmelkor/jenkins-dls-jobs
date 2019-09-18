folder('Cats')
multibranchPipelineJob('Cats/jte-test-app-pr-health') {
    branchSources {
        github {
            id('dce33511-a216-42f1-b7e4-83eefca7baca')
            scanCredentialsId('alexmelkor_github_credentials')
            repoOwner('alexmelkor')
            repository('jte-test-app')
            buildOriginBranchWithPR(true)
            buildOriginBranch(false)
            buildForkPRHead(false)
            buildForkPRMerge(false)
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            daysToKeep(-1)
            numToKeep(7)
        }
    }
    factory {
        templateBranchProjectFactory { 
            scriptPath("") 
        }
    }
}
