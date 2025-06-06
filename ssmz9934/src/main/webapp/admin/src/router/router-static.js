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
    import banzhuren from '@/views/modules/banzhuren/list'
    import jiazhang from '@/views/modules/jiazhang/list'
    import zizhushenqing from '@/views/modules/zizhushenqing/list'
    import shenqingfuyi from '@/views/modules/shenqingfuyi/list'
    import mingdangongshi from '@/views/modules/mingdangongshi/list'
    import xueshengxinxi from '@/views/modules/xueshengxinxi/list'
    import discussmingdangongshi from '@/views/modules/discussmingdangongshi/list'
    import gonggaofenlei from '@/views/modules/gonggaofenlei/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import zizhupingyi from '@/views/modules/zizhupingyi/list'
    import config from '@/views/modules/config/list'
    import huizhigonggao from '@/views/modules/huizhigonggao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
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
	path: '/banzhuren',
        name: '班主任',
        component: banzhuren
      }
      ,{
	path: '/jiazhang',
        name: '家长',
        component: jiazhang
      }
      ,{
	path: '/zizhushenqing',
        name: '资助申请',
        component: zizhushenqing
      }
      ,{
	path: '/shenqingfuyi',
        name: '申请复议',
        component: shenqingfuyi
      }
      ,{
	path: '/mingdangongshi',
        name: '名单公示',
        component: mingdangongshi
      }
      ,{
	path: '/xueshengxinxi',
        name: '学生信息',
        component: xueshengxinxi
      }
      ,{
	path: '/discussmingdangongshi',
        name: '名单公示评论',
        component: discussmingdangongshi
      }
      ,{
	path: '/gonggaofenlei',
        name: '公告分类',
        component: gonggaofenlei
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/zizhupingyi',
        name: '资助评议',
        component: zizhupingyi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/huizhigonggao',
        name: '回执公告',
        component: huizhigonggao
      }
    ]
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
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
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

export default router;
