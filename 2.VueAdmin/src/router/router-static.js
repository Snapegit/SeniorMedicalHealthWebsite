import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import news from '@/views/modules/news/list'
    import ziyuanleixing from '@/views/modules/ziyuanleixing/list'
    import yinshijianyi from '@/views/modules/yinshijianyi/list'
    import jiankangdangan from '@/views/modules/jiankangdangan/list'
    import jiankangshuju from '@/views/modules/jiankangshuju/list'
    import examquestion from '@/views/modules/examquestion/list'
    import yundongjianyi from '@/views/modules/yundongjianyi/list'
    import zaixianwenzhen from '@/views/modules/zaixianwenzhen/list'
    import changjianwenti from '@/views/modules/changjianwenti/list'
    import exampaper from '@/views/modules/exampaper/list'
    import forum from '@/views/modules/forum/list'
    import jianchabaogao from '@/views/modules/jianchabaogao/list'
    import jiaoyuziyuan from '@/views/modules/jiaoyuziyuan/list'
    import fuyaojilu from '@/views/modules/fuyaojilu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import zaixianyuyue from '@/views/modules/zaixianyuyue/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'
    import zhaohuzhidao from '@/views/modules/zhaohuzhidao/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '健康资讯',
        component: news
      }
      ,{
	path: '/ziyuanleixing',
        name: '资源类型',
        component: ziyuanleixing
      }
      ,{
	path: '/yinshijianyi',
        name: '饮食建议',
        component: yinshijianyi
      }
      ,{
	path: '/jiankangdangan',
        name: '健康档案',
        component: jiankangdangan
      }
      ,{
	path: '/jiankangshuju',
        name: '健康数据',
        component: jiankangshuju
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/yundongjianyi',
        name: '运动建议',
        component: yundongjianyi
      }
      ,{
	path: '/zaixianwenzhen',
        name: '在线问诊',
        component: zaixianwenzhen
      }
      ,{
	path: '/changjianwenti',
        name: '常见问题',
        component: changjianwenti
      }
      ,{
	path: '/exampaper',
        name: '健康测试管理',
        component: exampaper
      }
      ,{
	path: '/forum',
        name: '社区互动',
        component: forum
      }
      ,{
	path: '/jianchabaogao',
        name: '检查报告',
        component: jianchabaogao
      }
      ,{
	path: '/jiaoyuziyuan',
        name: '教育资源',
        component: jiaoyuziyuan
      }
      ,{
	path: '/fuyaojilu',
        name: '服药记录',
        component: fuyaojilu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/zaixianyuyue',
        name: '在线预约',
        component: zaixianyuyue
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
      ,{
	path: '/zhaohuzhidao',
        name: '照护指导',
        component: zhaohuzhidao
      }
      ,{
	path: '/newstype',
        name: '健康资讯分类',
        component: newstype
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
