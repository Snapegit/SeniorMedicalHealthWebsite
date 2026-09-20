import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import ExamPaper from '../pages/exam/examPaper'
import Exam from '../pages/exam/exam'
import ExamList from '../pages/exam/examList'
import ExamRecord from '../pages/exam/examRecord'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yishengList from '../pages/yisheng/list'
import yishengDetail from '../pages/yisheng/detail'
import yishengAdd from '../pages/yisheng/add'
import zaixianwenzhenList from '../pages/zaixianwenzhen/list'
import zaixianwenzhenDetail from '../pages/zaixianwenzhen/detail'
import zaixianwenzhenAdd from '../pages/zaixianwenzhen/add'
import zaixianyuyueList from '../pages/zaixianyuyue/list'
import zaixianyuyueDetail from '../pages/zaixianyuyue/detail'
import zaixianyuyueAdd from '../pages/zaixianyuyue/add'
import zhaohuzhidaoList from '../pages/zhaohuzhidao/list'
import zhaohuzhidaoDetail from '../pages/zhaohuzhidao/detail'
import zhaohuzhidaoAdd from '../pages/zhaohuzhidao/add'
import jiaoyuziyuanList from '../pages/jiaoyuziyuan/list'
import jiaoyuziyuanDetail from '../pages/jiaoyuziyuan/detail'
import jiaoyuziyuanAdd from '../pages/jiaoyuziyuan/add'
import ziyuanleixingList from '../pages/ziyuanleixing/list'
import ziyuanleixingDetail from '../pages/ziyuanleixing/detail'
import ziyuanleixingAdd from '../pages/ziyuanleixing/add'
import changjianwentiList from '../pages/changjianwenti/list'
import changjianwentiDetail from '../pages/changjianwenti/detail'
import changjianwentiAdd from '../pages/changjianwenti/add'
import jiankangdanganList from '../pages/jiankangdangan/list'
import jiankangdanganDetail from '../pages/jiankangdangan/detail'
import jiankangdanganAdd from '../pages/jiankangdangan/add'
import jianchabaogaoList from '../pages/jianchabaogao/list'
import jianchabaogaoDetail from '../pages/jianchabaogao/detail'
import jianchabaogaoAdd from '../pages/jianchabaogao/add'
import fuyaojiluList from '../pages/fuyaojilu/list'
import fuyaojiluDetail from '../pages/fuyaojilu/detail'
import fuyaojiluAdd from '../pages/fuyaojilu/add'
import jiankangshujuList from '../pages/jiankangshuju/list'
import jiankangshujuDetail from '../pages/jiankangshuju/detail'
import jiankangshujuAdd from '../pages/jiankangshuju/add'
import yundongjianyiList from '../pages/yundongjianyi/list'
import yundongjianyiDetail from '../pages/yundongjianyi/detail'
import yundongjianyiAdd from '../pages/yundongjianyi/add'
import yinshijianyiList from '../pages/yinshijianyi/list'
import yinshijianyiDetail from '../pages/yinshijianyi/detail'
import yinshijianyiAdd from '../pages/yinshijianyi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'examPaper',
					component: ExamPaper
				},
				{
					path: 'examList',
					component:ExamList
				},
				{
					path: 'examRecord/:type',
					component:ExamRecord
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yisheng',
					component: yishengList
				},
				{
					path: 'yishengDetail',
					component: yishengDetail
				},
				{
					path: 'yishengAdd',
					component: yishengAdd
				},
				{
					path: 'zaixianwenzhen',
					component: zaixianwenzhenList
				},
				{
					path: 'zaixianwenzhenDetail',
					component: zaixianwenzhenDetail
				},
				{
					path: 'zaixianwenzhenAdd',
					component: zaixianwenzhenAdd
				},
				{
					path: 'zaixianyuyue',
					component: zaixianyuyueList
				},
				{
					path: 'zaixianyuyueDetail',
					component: zaixianyuyueDetail
				},
				{
					path: 'zaixianyuyueAdd',
					component: zaixianyuyueAdd
				},
				{
					path: 'zhaohuzhidao',
					component: zhaohuzhidaoList
				},
				{
					path: 'zhaohuzhidaoDetail',
					component: zhaohuzhidaoDetail
				},
				{
					path: 'zhaohuzhidaoAdd',
					component: zhaohuzhidaoAdd
				},
				{
					path: 'jiaoyuziyuan',
					component: jiaoyuziyuanList
				},
				{
					path: 'jiaoyuziyuanDetail',
					component: jiaoyuziyuanDetail
				},
				{
					path: 'jiaoyuziyuanAdd',
					component: jiaoyuziyuanAdd
				},
				{
					path: 'ziyuanleixing',
					component: ziyuanleixingList
				},
				{
					path: 'ziyuanleixingDetail',
					component: ziyuanleixingDetail
				},
				{
					path: 'ziyuanleixingAdd',
					component: ziyuanleixingAdd
				},
				{
					path: 'changjianwenti',
					component: changjianwentiList
				},
				{
					path: 'changjianwentiDetail',
					component: changjianwentiDetail
				},
				{
					path: 'changjianwentiAdd',
					component: changjianwentiAdd
				},
				{
					path: 'jiankangdangan',
					component: jiankangdanganList
				},
				{
					path: 'jiankangdanganDetail',
					component: jiankangdanganDetail
				},
				{
					path: 'jiankangdanganAdd',
					component: jiankangdanganAdd
				},
				{
					path: 'jianchabaogao',
					component: jianchabaogaoList
				},
				{
					path: 'jianchabaogaoDetail',
					component: jianchabaogaoDetail
				},
				{
					path: 'jianchabaogaoAdd',
					component: jianchabaogaoAdd
				},
				{
					path: 'fuyaojilu',
					component: fuyaojiluList
				},
				{
					path: 'fuyaojiluDetail',
					component: fuyaojiluDetail
				},
				{
					path: 'fuyaojiluAdd',
					component: fuyaojiluAdd
				},
				{
					path: 'jiankangshuju',
					component: jiankangshujuList
				},
				{
					path: 'jiankangshujuDetail',
					component: jiankangshujuDetail
				},
				{
					path: 'jiankangshujuAdd',
					component: jiankangshujuAdd
				},
				{
					path: 'yundongjianyi',
					component: yundongjianyiList
				},
				{
					path: 'yundongjianyiDetail',
					component: yundongjianyiDetail
				},
				{
					path: 'yundongjianyiAdd',
					component: yundongjianyiAdd
				},
				{
					path: 'yinshijianyi',
					component: yinshijianyiList
				},
				{
					path: 'yinshijianyiDetail',
					component: yinshijianyiDetail
				},
				{
					path: 'yinshijianyiAdd',
					component: yinshijianyiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
		{
			path: '/exam',
			component: Exam
		}
	]
})
