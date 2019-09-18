multibranchPipelineJob('test-github-webhooks-pr-health') {
    branchSources {
        github {
            id('894e0368-9b9e-4d14-992e-5caeb3bc8a58')
            scanCredentialsId('alexmelkor_github_credentials')
            repoOwner('alexmelkor')
            repository('test-github-webhooks')
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
}
