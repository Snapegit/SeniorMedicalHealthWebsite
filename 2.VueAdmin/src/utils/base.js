const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooto44jrjgr/",
            name: "springbooto44jrjgr",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooto44jrjgr/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于javaweb老年医疗保健网站"
        } 
    }
}
export default base
