package com.ymhase.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class AppInfo implements Comparable<AppInfo> {
	int deviceId;
	int memory;
	boolean isUsed;

	public AppInfo() {

	}

	public AppInfo(int deviceId, int memory) {
		this.deviceId = deviceId;
		this.memory = memory;
		this.isUsed = false;
	}

	@Override
	public int compareTo(AppInfo o) {
		// TODO Auto-generated method stub
		if (this.memory == o.memory)
			return 0;
		else
			return this.memory > o.memory ? 1 : -1;

	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "AppInfo [deviceId=" + deviceId + ", memory=" + memory + ", isUsed=" + isUsed + "]";
	}

}


public class OptimList {

	
	public static List<List<Integer>> optimalUtilizationNew(int deviceCapacity, List<List<Integer>> foregroundAppList,
			List<List<Integer>> backroundAppList) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<AppInfo> foreApp = prepareList(foregroundAppList);
		List<AppInfo> backApp = prepareList(backroundAppList);

		for (int i = 0; i < foreApp.size(); i++) {
			AppInfo fApp = foreApp.get(i);
			if (deviceCapacity <= 0) {
				break;
			}

			for (int j = 0; j < backApp.size(); j++) {
				AppInfo bApp = backApp.get(j);
				if (deviceCapacity >= (fApp.getMemory() + bApp.getMemory())) {
					if (bApp.isUsed() == false) {
						List<Integer> validPair = new ArrayList<Integer>();
						validPair.add(fApp.getDeviceId());
						validPair.add(bApp.getDeviceId());
						fApp.setUsed(true);
						bApp.setUsed(true);
						deviceCapacity = deviceCapacity - (fApp.getMemory() + bApp.getMemory());
						result.add(validPair);
					}
				} else {
					break;
				}
			}
		}

		return result;
	}

	private static List<AppInfo> prepareList(List<List<Integer>> foregroundAppList) {
		List<AppInfo> list = new ArrayList<AppInfo>();
		for (int i = 0; i < foregroundAppList.size(); i++) {
			List<Integer> app = foregroundAppList.get(i);
			AppInfo appInfo = new AppInfo(app.get(0), app.get(1));
			list.add(appInfo);
		}

		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
	
	
	public static void main(String[] args) {
		
		
		OptimList o = new OptimList();
		
		List<List<Integer>> fg = new ArrayList<>();
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		
		
		fg.add((ArrayList<Integer>) l1);
		List<List<Integer>> bg = new ArrayList<>();
		
		
		List<Integer> l2 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		bg.add((ArrayList<Integer>) l2);
		
		o.optimalUtilizationNew(4, fg, bg);
		
	}

}
